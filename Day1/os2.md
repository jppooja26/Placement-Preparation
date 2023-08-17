# Difference between process and program and threads? Different types of process? 

**Program VS Process**
| Program | Process |
|:------- |  -----: |
|Instruction in any programming language | Instruction in machine code |
|Resides in secondary storage device | Resides in the main memory |
|Only needs memory for storage | Resource requirement is quite high |
|Lifespan is unlimited | Lifespan is limited |
|Passive entity - responds to external inputs | Active entity - actively initiates actions | 


**Thread VS Process**
| Thread | Process |
|:------ |  -----: |
|Easier to create and terminate | Not easy to create and terminate |
|Multiple threads when in same process share same address | Do not share same address |
|Easy to communicate between threads | Communication between processes requires OS intervention |
|Takes less time in context switching | Takes more time in context switching |
|Lightweight process and shares code, data and resources | Called a heavyweight process | 


**Types of Process**

Two types of event-specific processes:
1. **I/O bound**: If a program/process spends more of its time doing I/O than it spends doing computations.
2. **CPU bound**: If a program/process spends more of its time doing CPU operations(computations) and generates 
I/O requests infrequently.