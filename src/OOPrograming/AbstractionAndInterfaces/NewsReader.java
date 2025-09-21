package OOPrograming.AbstractionAndInterfaces;

abstract class NewsReader extends NewsPaper {

    @Override
    void news1() {
        System.out.println("News 1: New Java Version Released");
    }

    @Override
    void news2() {
        System.out.println("News 2: AI is transforming the tech industry");
    }
    
}
