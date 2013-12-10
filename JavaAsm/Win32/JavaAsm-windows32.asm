.386
.model flat,stdcall
.code
    
Java_ua_khpcc_ilnitsky_courseproject_JavaAsm_asmAdd proc JNIEnv:DWORD, jobject:DWORD, num1:DWORD, num2:DWORD
    fld num1
    fadd num2
    fst num1
    mov eax, num1
    ret  
Java_ua_khpcc_ilnitsky_courseproject_JavaAsm_asmAdd endp

Java_ua_khpcc_ilnitsky_courseproject_JavaAsm_asmMul proc JNIEnv:DWORD, jobject:DWORD, num1:DWORD, num2:DWORD
    fld num1
    fmul num2
    fst num1
    mov eax, num1
    ret  
Java_ua_khpcc_ilnitsky_courseproject_JavaAsm_asmMul endp

Java_ua_khpcc_ilnitsky_courseproject_JavaAsm_asmDiv proc JNIEnv:DWORD, jobject:DWORD, dvd:DWORD, dvs:DWORD
    fld dvd
    fdiv dvs
    fst dvd
    mov eax, dvd
    ret
Java_ua_khpcc_ilnitsky_courseproject_JavaAsm_asmDiv endp

end