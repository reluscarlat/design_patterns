package strategy;

public class RarCompressionStrategy implements CompressionStrategy {
    @Override
    public void compressFile(String filename) {
        System.out.println(filename + " compressed using Rar.");
    }
}
