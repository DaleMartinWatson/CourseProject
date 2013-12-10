"C:\Program Files\Microsoft Platform SDK\Bin\win64\x86\AMD64\link.exe" /DLL /NOENTRY /DEF:JavaAsm-windows64.def JavaAsm-windows64.obj
copy /Y JavaAsm-windows64.dll ..\..\CourseProject\src\lib
move /Y JavaAsm-windows64.dll ..
pause