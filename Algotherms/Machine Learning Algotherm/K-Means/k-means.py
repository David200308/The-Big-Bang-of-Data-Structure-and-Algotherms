import re
import numpy as np
import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
import warnings
warnings.filterwarnings('ignore')

data = pd.read_csv('clustering.csv')
data.head()

data = data.loc[:, ['ApplicantIncome', 'LoanAmount']]
data.head()

X = data.values

sns.scatterplot(X[:, 0], X[:, 1])
plt.xlabel('Income')
plt.ylabel('Loan')
plt.show()

def calculate_cost(X, centroids, cluster):
    sum = 0
    for i, val in enumerate(X):
        sum += np.sqrt((centroids[int(cluster[i]), 0] - val[0]) ** 2 + (centroids[int(cluster[i]), 1] - val[1]) ** 2)
        return sum

def kmeans(X, k):
    diff = 1
    cluster = np.zeros(X.shape[0])
    centroids = data.sample(n = k).values
    while diff:
        for i, row in enumerate(X):
            mn_dist = float('inf')

            for idx, centroid in enumerate(centroids):
                d = np.sqrt((centroid[0] - row[0]) ** 2 + (centroid[1] - row[1]) ** 2)
                
                if mn_dist > d:
                    mn_dist = d
                    cluster[i] = idx
        new_centroids = pd.DataFrame(X).groupby(by = cluster).mean().values

        if np.count_nonzero(centroids - new_centroids) == 0:
            diff = 0

        else:
            centroids = new_centroids

    return centroids, cluster

cost_list = []
for k in range(1, 10):
    centroids, cluster = kmeans(X, k)
    cost = calculate_cost(X, centroids, cluster)
    cost_list.append(cost)

sns.lineplot(x=range(1,10), y=cost_list, marker='o')
plt.xlabel('k')
plt.ylabel('WCSS')
plt.show()

k = 4
centroids, cluster = kmeans(X, k)

sns.scatterplot(X[:,0], X[:, 1], hue=cluster)
sns.scatterplot(centroids[:,0], centroids[:, 1], s=100, color='y')
plt.xlabel('Income')
plt.ylabel('Loan')
plt.show()