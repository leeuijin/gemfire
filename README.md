# Test Files
1. GemFireHello.java     : Simle test : Data insert(put) & one by one select(get)    --[Lab1]
2. HelloMap.java         : Using HashMap select(get) data   --[Lab2]
3. GemFireTest.java     : Compare select (get) Performance Test (One by one fetch & HashMap & ConcurrentHashMap ) --[Lab2]
4. Gemfire_lab3.java  :  Serialization data insert & print --[Lab3]
5. President.java     :  Serialization data structures class file (name,birth_location,birthday) --[Lab3]
    
Test Env (VM)

* OS: Rocky Linux release 8.10 (Green Obsidian)
* CPU : 2 Core , Memory 8192MB
* GemFire version : 10.1.1 (vmware-gemfire-10.1.1.tgz)
* JDK version : Java version: 11.0.23
* Maven version : Apache Maven 3.9.7 

# Compare select (get) Performance Test Result (lab2)

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

# Data Serializastion Insert Test (lab3)
1. Gemfire_lab3.java  :  Excution main file ( connection & region create & Serialization data insert & print )
2. President.java     :  Serialization data structures file (name,birth_location,birthday)

**Gemfire_lab3 Results:**

JamesMadison: JamesMadison (Birth_location: Godam City, Birthday: 20240101)
WilliamHenryHarrison: WilliamHenryHarrison (Birth_location: Edelweiss, Birthday: 20180101)
JohnQuincyAdams: JohnQuincyAdams (Birth_location: tokyo, Birthday: 20210101)
JohnTyler: JohnTyler (Birth_location: beijing, Birthday: 20190101)
JamesMonroe: JamesMonroe (Birth_location: Seoul, Birthday: 20230101)
AndewJackson: AndewJackson (Birth_location: AndewJackson City)
MartinVanBuren: MartinVanBuren (Birth_location: MartinVanBuren City)

## References : 
https://github.com/apache/geode-examples/blob/develop/serialization/src/main/java/org/apache/geode_examples/serialization

## More informations (Korean Doc) : 

Gemfire Installation (VM) : https://geartec82.atlassian.net/wiki/external/ZDc5NGVjM2M1YzQ5NGY1ZWE3ZmZlYzhkYmNiYTU5Yzc

Gemfire Management Console Installation (VM) : https://geartec82.atlassian.net/wiki/external/ZWM3NmIxYTU0M2QzNGMyMTlhOTY5ODFjYjhhNzBkZmE



