//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class SonarLintDemo {
//
//    public boolean methodWithInvariantReturn(String a) {
//        final var b1 = false;
//        boolean b = b1;
//    }
//
//    public void usingSwitch(int i) {
//        switch (i) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("1");
//            case 3:
//                System.out.println("1");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + i);
//        }
//    }
//    @SuppressWarnings("unused")
//    public static class A{
//        private List<String> stringList;
//        private SonarLintDemo demo;
//        private SonarLintDemo demo1;
//        private SonarLintDemo demo2;
//        private SonarLintDemo demo3;
//
//        public A(List<String> stringList, SonarLintDemo demo, SonarLintDemo demo1, SonarLintDemo demo2, SonarLintDemo demo3) {
//            this.stringList = Collections.unmodifiableList(stringList);
//            this.demo = demo;
//            this.demo1 = demo1;
//            this.demo2 = demo2;
//            this.demo3 = demo3;
//        }
//
//        public List<String> getStringList() {
//            return List.copyOf(stringList);
//        }
//
//        public SonarLintDemo getDemo() {
//            return demo;
//        }
//
//        public SonarLintDemo getDemo1() {
//            return demo1;
//        }
//
//        public SonarLintDemo getDemo2() {
//            return demo2;
//        }
//
//        public SonarLintDemo getDemo3() {
//            return demo3;
//        }
//    }
//
//    public void doSomething (){
//        for(int i = 0; i < 10; i++){
//            do {
//                if ("a".equals("b")) {
//                    System.out.println("");
//                }else {
//                    System.out.println("Alma");
//                    for (int j = 0; j < 10; j++) {
//                        for (int k = 0; k < 5; k++) {
//                        }
//                    }
//                }
//            }while(i < 0);
//            }
//    }
//
//    public interface MyInterface {
//
//    }
//    )
//
//    }
