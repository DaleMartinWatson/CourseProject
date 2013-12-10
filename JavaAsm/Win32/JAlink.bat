C:\masm32\bin\link.exe /DLL /NOENTRY /DEF:JavaAsm-windows32.def JavaAsm-windows32.obj 
copy /Y JavaAsm-windows32.dll ..\..\CourseProject\src\lib
move /Y JavaAsm-windows32.dll ..
pause