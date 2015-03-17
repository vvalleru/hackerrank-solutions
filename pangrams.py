def isPangram(s):
  map = [False] * 26
  
  for char in s:
    if char.isalpha():
      map[ord(char.lower()) - ord('a')] = True
  
  for each in map:
    if not each:
      return 'not pangram'

  return 'pangram'
  
input = raw_input()
print isPangram(input)