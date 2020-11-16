grammar Data;

// 匹配文件：若干个group
file : group+ ;

// 匹配group：首先是一个数字，接下来匹配sequence，并将数字值作为参数传入
group: INT sequence[$INT.int] {System.out.println($sequence.text);};

// 匹配sequence，传入的参数值为n
sequence[int n]
locals [int i = 1;] // 设置一个本地变量i，初始为1
     : ( {$i<=$n}? INT {$i++;} )* // 语法判定为true时匹配一个INT，并将i加1
     ;

INT :   [0-9]+ ;             // 匹配无符号整数
WS  :   [ \t\n\r]+ -> skip ; // 匹配到空白符时丢弃
