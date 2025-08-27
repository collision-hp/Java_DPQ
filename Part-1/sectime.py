''' 
given time in seconds=7500
convert to time in format 2h5m0s
'''
hour=7500//3600
print(hour)
min=(7500//60)%60
print(min)
sec=7500-hour*3600-min*60
print(sec)

print()