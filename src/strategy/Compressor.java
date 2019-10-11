package strategy;

public class Compressor {
    private CompressionStrategy strategy;

    public Compressor() {
        this.strategy = new RarCompressionStrategy();
    }

    public void setStrategy(CompressionStrategy compressionStrategy) {
        this.strategy = compressionStrategy;
    }

    public void compressFile(String fileName) {
        strategy.compressFile(fileName);
    }
}
