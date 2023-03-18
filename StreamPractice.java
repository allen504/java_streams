import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

class StreamPractice{
    public static void main(String...args){
        //create stream from array with Stream.of() or Arrays.stream
        String words = "I'm practicing java streams to be a better developer";
        Stream<String> stream1 = Stream.of(words.split(" "));
        Stream<String> stream2 = Stream.of("I","hope","it","works");
        Stream<String> stream3 = Arrays.stream(words.split(" "),3,7);
        
        //infinite streams with Stream.generate()
        Stream<String> stream4 = Stream.generate(()->"Echo");
        Stream<Double> stream5 = Stream.generate(Math::random);
        
        //stream sequences with Stream.iterate()
        Stream<BigInteger> stream6 = Stream.iterate(BigInteger.ZERO, n->n.add(BigInteger.ONE));
        var limit = new BigInteger("10000000");
        Stream<BigInteger> stream7 = Stream.iterate(BigInteger.ZERO,n->n.compareTo(limit) < 0,n->n.add(BigInteger.ONE));
        //stream7.forEach(n->System.out.println(n));
    }
}