package OOPrograming.AbstractionAndInterfaces;

public class Main {

    public static void main(String[] args) {

        NewsPaper newsPaper = new NewsPaper() {
            @Override
            void news1() {
                System.out.println("News 1: New Oil Discovery in the North Sea");
            }

            @Override
            void news2() {
                System.out.println("News 2: Advances in Renewable Energy Technologies");
            }
        };

        newsPaper.news1();

    }

}
