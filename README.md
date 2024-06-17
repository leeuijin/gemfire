1. GemFireHello.java : simle test : Data insert(put) & one by one select(get)
    President #1 was null
    President #2 was null
    President #3 was null
    President #4 was James Madison
    President #5 was James Monroe
    President #7 was Andew Jackson
    President #8 was Martin Van Buren
    President #9 was William Henry Harrison
    President #10 was John Tyler
    President #11 was null
    President #12 was null
    President #6 was John Quincy Adams
    President #13 was null
    President #14 was null
    President #15 was null
    President #16 was null
    President #17 was null
    President #18 was null
    President #19 was null
    President #20 was null
   
3. HelloMap.java : Using HashMap select(get) data
    Code Result
    President #1: George Washington
    President #2: John Adams
    President #3: Thomas Jefferson
    President #4: James Madison
    President #5: James Monroe
    President #6: John Quincy Adams
    President #7: Andew Jackson
    President #8: Martin Van Buren
    President #9: William Henry Harrison
    President #10: John Tyler
   
4. GemFireTest.java : Compare performance test with one by one fetch & HashMap
    Test Results:
    Data insertion time: 270 ms
    HashMap Data select query time: 15 ms
    One by one fetch Data select query time: 37 ms
    
