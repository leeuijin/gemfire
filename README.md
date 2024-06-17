1. GemFireHello.java : simle test : Data insert(put) & one by one select(get)
2. HelloMap.java : Using HashMap select(get) data   
3. GemFireTest.java : Compare select (get) Performance Test with one by one fetch & HashMap fetch
    
Test Env (VM)

* OS: Rocky Linux release 8.10 (Green Obsidian)
* CPU : 2 Core , Memory 8192MB
* GemFire version : 10.1.1 (vmware-gemfire-10.1.1.tgz)
* Maven version : Apache Maven 3.9.7 

Test Result

Data insertion time: 248 ms
HashMap Data select query time: 17 ms
One by one fetch Data select query time: 46 ms
