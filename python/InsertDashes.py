#Write a function insertDash(num) that will insert dashes ('-') between each two odd numbers in num. For example: #if num is 454793 the output should be 4547-9-3. Don't count zero as an odd number. 


import re

def insert_dash(num):
    #your code here
    return re.sub(r'([13579])(?=[13579])', r'\1-', str(num))