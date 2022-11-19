def NaiveSearch(text, pattern):
    text_size = len(text)
    pattern_size = len(pattern)

    if text_size < pattern_size:
        print("Pattern not found")
        return
    for i in range(text_size - pattern_size + 1):
        j = 0
        while j < pattern_size:
            if (text[i + j] != pattern[j]):
                break
            j += 1
        if j == pattern_size:
            print("Pattern found at index: ", i)

text = "THIS IS A TEST TEXT"
pattern = "TEST"
NaiveSearch(text, pattern)