.386
.model flat,stdcall
.code
    
Java_ua_khpcc_ilnitsky_javaasm_JavaAsm_asmFAdd proc JNIEnv:DWORD, jobject:DWORD, num1:DWORD, num2:DWORD
    fld num1
    fadd num2
    fst num1
    mov eax, num1
    ret  
Java_ua_khpcc_ilnitsky_javaasm_JavaAsm_asmFAdd endp

Java_ua_khpcc_ilnitsky_javaasm_JavaAsm_asmFMul proc JNIEnv:DWORD, jobject:DWORD, num1:DWORD, num2:DWORD
    fld num1
    fmul num2
    fst num1
    mov eax, num1
    ret  
Java_ua_khpcc_ilnitsky_javaasm_JavaAsm_asmFMul endp

Java_ua_khpcc_ilnitsky_javaasm_JavaAsm_asmFDiv proc JNIEnv:DWORD, jobject:DWORD, dvd:DWORD, dvs:DWORD
    fld dvd
    fdiv dvs
    fst dvd
    mov eax, dvd
    ret
Java_ua_khpcc_ilnitsky_javaasm_JavaAsm_asmFDiv endp

end