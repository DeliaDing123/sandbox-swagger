package java;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

class SpringbootSwaggerAppTest extends Thread{


//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//class Employee<T1,T2>{
//    public Employee(int d, String name){}
//}
//@SpringBootApplication
//public  class SpringbootSwaggerApp extends  Thread{
    public static int ammount = 0;
    //    static int number2 = getValue();
//    static int number1=10;
//    static int doSum(){return number1+number2;};
//    static int doMinus(){return number1-number2;};
//    static int getValue(){return number1;
//    };
//    interface StringFunction{
//        String run(String str);
//    }
//    public static void printFormmed(String str, StringFunction sFun){
//        String result = sFun.run(str);
//        System.out.println(result);
//    }
    public void run(){
        ammount++;

    }
    @Test
    public static void test(String[] args) throws IOException {
        SpringbootSwaggerAppTest thread = new SpringbootSwaggerAppTest();
        thread.start();
        while (thread.isAlive())System.out.println("waiting ...");
        System.out.println(ammount);
        ammount++;
        System.out.println(ammount);


//        StringFunction exclaim = s->s+"!";
//        StringFunction ask = s->s+"?";
//        printFormmed("Hello", exclaim);
//        printFormmed("Hello", ask);



//question 3
//           ArrayList<Integer> arrayList = new ArrayList<Integer>();
//           arrayList.add(3);
//           arrayList.add(7);
//           arrayList.add(1);
//           Consumer<Integer> method = (n->System.out.println(n));
//           arrayList.forEach(method);

// question 2
//        byte c1[] ={1,2,3,4,5};
//        byte c2[] ={6,7,8,9};
//        ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
//        b2.write(100);
//        System.out.println(b2.size());
//        b2.write(c1,0,c2.length);
//        System.out.println(b2.size());
//        byte b[] = b2.toByteArray();
//        System.out.println(b.length);
//        b2.flush();
//        System.out.println(b2.size());
//        b2.reset();
//        System.out.println(b2.size());

        //question 1
//            System.out.println(number2);
//            System.out.println("Number1 + Number2 = " + doSum());
//            System.out.println(doMinus());
    }
}
//    interface  MyInterfate{
//        Collection<Integer> getCollection();
//        default  Integer getLargeAmount(){return null;}
//
//    }
//
//    class MyClass implements  MyInterfate{
//        public Collection<Integer> getCollection(){
//            return null;
//        }
//        public Integer getLargeAmount(){
//            return MyInterfate.super.getLargeAmount();
//        }
//    }
//}
//public class SpringbootSwaggerApp  extends HttpServlet {
//    @Resource(name="jdbc/TimetableDBPool")
//    private DataSource dataSource;
//    @Override
//    protected void doGet (HttpServletRequest request, HttpServletResponse
//            response) throws ServletException, IOException {
//        String insertSql= "INSERT INTO purchase_order (id, description) VALUES (?,?)"; try {
//            Connection connection = dataSource.getConnection(); PreparedStatement insertStatement =
//                    connection.prepareStatement(insertSql); insertStatement.setInt(1, 12345); insertStatement.setString(2, "QAC Demo"); insertStatement.execute(); insertStatement.close();
//            connection.close();
//    }catch (SQLException e) { e.printStackTrace();
//        } }
//}
//class LB_1 {
//    public void retValue() {
//        System.out.println("LB_1");
//    } }
//    class A{
//    public ArrayList<LB_2> list = new ArrayList<LB_2>();
//}
//
//
//class LB_2 {
//    @Override
//    public String toString(){
//        return "test";
//    }
//    class  Element implements  Comparable{
//        int id;
//         Element (int id){
//             this.id=id;
//         }
//         public  int compareTo(Object obj){
//             Element e =(Element)  obj;
//             return this.id - e.id;
//         }
//         public String toString(){
//             return ""+this.id;
//         }
//    }
//



//    int x=5;
//    public static void main(String args[]) throws ParseException, ScriptException {
//StringBuilder builder = new StringBuilder("Wellcome everybody");
//StringJoiner joiner = new StringJoiner("","H","?");
//builder.replace(0,7,"elcome");
//builder.setCharAt(7,'!');
//joiner.add("ello and").add(builder);
//System.out.println(joiner.toString());

//        Double d = null;
//        System.out.println((d instanceof  Double)?"true":"false");
//        int c=0;
//        System.out.println((0==c++)?"true":"false");
//        ScriptEngineManager factory = new ScriptEngineManager();
//        ScriptEngine engine = factory.getEngineByName("nashorn");
//        engine.eval("var i=0;"
//        + "i++;"
//        + "var String = Java.type(\"java.lang.String\");"
//                + "var str = new String(\"Java\");"
//                +"print(str);"
//                +"print(i);");
//        Long l =new Long(1234);
//        System.out.println(l);
//        String first="first";
//                String second = new String("first");
//        "first".concat("second");
//        System.out.println(first.equals(second));
//        System.out.println(first == second);
//       System.out.println(Stream.of("green","yellow","blue")
//       .max((s1,s2)->s1.compareTo(s2))
//       .filter(s->s.endsWith("n"))
//       .orElse("yellow"));

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate bDate = LocalDate.parse("2012-01-15",formatter);
//        System.out.println(bDate.getMonthValue());
//      A a = new A();
//      a.list.add(new LB_2());
//      a= null;
//        Optional<Object> o = Optional.of(new LB_2());
//        System.out.println(o.get().toString());

//    }
//}



//    public static void main(String [] args){
//        IKMProcessor processor = new IKMProcessor();
//        processor.setup();
//        System.out.println("Processing complete");
//}
//}
//class IKMProcessor {
//    public List<String> queueSequence;
//
//    public void setup() {
//        try {
//            establishQueueSequence();
//        } finally {
//            cleanupQueueSequence();
//            System.out.println("Queue sequence successfully cleaned up");
//        }
//    }
//
//    private void cleanupQueueSequence() {
//        if (queueSequence.size() > 0) {
//            System.out.println("Queue size > 0");
//        }
//    }
//
//    private void establishQueueSequence() {
//        if (true) {
//            throw new IllegalArgumentException();
//        }
//        queueSequence = new ArrayList<String>();
//    }
//}
//    class ExceptionDemo {
//        public static void main(String[] args) {
//            for(int i=0; i<5; i++){
//                System.out.println("Just a test");
//            }
//            int y=0;
//            for (int x=3; x>y; x--, y++) {
//            System.out.print(x+""+y+"");
//        } } }
//}

//class SpringbootSwaggerApp { SpringbootSwaggerApp() {
//    this(0);
//    System.out.println("1"); }
//    SpringbootSwaggerApp(int x) { System.out.println("2"+x);
//    } }
//class Subclass extends SpringbootSwaggerApp { Subclass(int x) {
//    System.out.println("3"+ x); }
//    Subclass(int x, int y) { this(x);
//        System.out.println("4"+ x + y); }
//    public static void main(String[] args) { new Subclass(2,3);
//    } }
