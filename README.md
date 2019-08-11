# Part-2-QA-Challenge
Created a simple java program with 2 methods. One method prints “Hello” and the other method prints “World”. 
To call these methods concurrently & asynchronously, I have used Threads mechanism. That is, both methods are invoked at the same instant, not one after the other. So on console you
should sometimes see “World Hello” and sometimes “Hello World” depending on which method is invoked first. Repeated these calls every 10 seconds and stop after 1 minute.

Expected Result: On the console you should see 6 combinations, a mix of “Hello World” and “World Hello”

Note: 
If you dont see mix of both combination in one run, please run them for multiple time or decrease "intervalInSeconds" parameter value to 5 seconds (instead of 10 seconds), which ultimatly increases 6 combinations print to 12 combinations 
