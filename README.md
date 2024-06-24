# Test Files
1. GemFireHello.java : simle test : Data insert(put) & one by one select(get)
2. HelloMap.java : Using HashMap select(get) data   
3. GemFireTest.java : Compare select (get) Performance Test with one by one fetch & HashMap fetch
    
Test Env (VM)

* OS: Rocky Linux release 8.10 (Green Obsidian)
* CPU : 2 Core , Memory 8192MB
* GemFire version : 10.1.1 (vmware-gemfire-10.1.1.tgz)
* JDK version : Java version: 11.0.23
* Maven version : Apache Maven 3.9.7 

# Compare select (get) Performance Test Result 

## (keys : 10,000)

Data insertion time: 230 ms

HashMap Data select query time: 18 ms

One by one fetch Data select query time: 42 ms

ConcurrentHashMap fetch Data select query time: 10 ms

## (keys : 10,000,000)

Data insertion time: 18489 ms

HashMap Data select query time: 6482 ms

One by one fetch Data select query time: 8119 ms

ConcurrentHashMap fetch Data select query time: 6203 ms

## Atlassian link (Korean) : 

Gemfire Installation (VM) : https://geartec82.atlassian.net/wiki/external/ZDc5NGVjM2M1YzQ5NGY1ZWE3ZmZlYzhkYmNiYTU5Yzc

Gemfire Management Console Installation (VM) : https://geartec82.atlassian.net/wiki/external/ZWM3NmIxYTU0M2QzNGMyMTlhOTY5ODFjYjhhNzBkZmE


