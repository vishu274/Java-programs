class TestVariableScope{
int a=0;
static int b=0;
public void increment(){
a++;
b++;
System.out.println("a="+a+"b="+b);
}
public static void main(String args[]){
TestVariableScope s = new TestVariableScope();
s.increment();

TestVariableScope obj = new TestVariableScope();
obj.increment();
}
}