package Server.entity;

import java.io.Serializable;

public class server_proof_entity implements Serializable {
    public byte[][] EMM;
    public byte[][] VMM;
    public int MAX_VOLUME_LENGTH;
    public int server_level;
    public int server_DEFAULT_INITIAL_CAPACITY;
}
