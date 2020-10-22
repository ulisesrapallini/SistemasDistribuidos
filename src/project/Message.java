package project;

public class Message {

    private String origen;
    private String destino;
    private String portOirgen;
    private String portDestino;
    private String datos;
    private String flags; // "ACK", "OK"

    public Message(){ }
    public Message(byte[] datos){ }

    public byte [] toArrayByte(){
       String separador = "#";
       String marcaString = "#S";
       String datos = this.origen+this.destino+this.portDestino+this.portDestino+this.flags;
       return datos.getBytes();
    }

    public Message toMessage( byte[] datos){
        

        return this;
    }
    // "#Shola#I33#S"

}
