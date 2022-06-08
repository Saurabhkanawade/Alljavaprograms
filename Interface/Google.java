package Interface;

public interface Google {

    void gmail();

    default void youtube() {

        System.out.println("no 1 video platform");
    }
}

class Testgoogle {

    public static void main(String[] args) {

//		Google g = new Google() {
//
//			public void gmail() {
//				System.out.println("This is a anonymous method ");
//			}
//		};
//		g.gmail();
//		g.youtube();
//

        Google g = () -> {

            System.out.println("This is gmails");
        };
        g.gmail();
        g.youtube();

        Google g1 = () -> {
            System.out.println("This is gmails2");
        };
        g1.gmail();
        g1.youtube();
    }
}