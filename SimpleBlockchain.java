import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Define a Block class


// Define a Blockchain class


public class SimpleBlockchain {
    public static void main(String[] args) {
        // Create a new blockchain
        Blockchain blockchain = new Blockchain();

        // Add some blocks to the blockchain
        blockchain.addBlock("Transaction 1");
        blockchain.addBlock("Transaction 2");
        blockchain.addBlock("Transaction 3");

        // Print the blockchain
        blockchain.printBlockchain();

    }
}
