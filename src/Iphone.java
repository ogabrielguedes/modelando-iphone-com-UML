package src;

public class Iphone implements navegadorWeb, MusicPlayer, Telefone{
    private double memoria = 6000;
    private double armazenamento = 1200000;
    private int numeroSerie = 0101010123;
   
    public void play() {
      System.out.println("Tocando Música");
    }
  
    
    public void pause() {
      System.out.println("Pausando a Música");
    }
  
  
    public void rewind() {
      System.out.println("Voltando a  Música");
    }
  
  
    public void forward() {
      System.out.println("avançando Música");
    }
  
   
    public void chamar(String numero) {
      System.out.printf("\n Chamando para o numero: %s \n", numero);
    }
  
    
    public void receber() {
      System.out.println("Recebendo ligação");
    }
  
    
    public void enviaSMS(String numero) {
      System.out.printf("\n Enviando sms para o numero: %s \n", numero);
    }
  
   
    public void conectar() {
      System.out.println("Conectando na internet");
    }
  
   
    public void acessarUrl(String url) {
      System.out.printf("\n acessando o site: %s \n", url);
    }
  
  
    public void fazerDownload() {
      System.out.println("Fazendo Download do arquivo");
    }
  
   
    public void adicionarFavorito() {
      System.out.println("Adicionando pagina aos favoritos");
    }
  
    
    public String toString() {
      return "Iphone{" +
              "memoria=" + memoria + " mb" +
              ", armazenamento=" + armazenamento + " mb" +
              ", numeroSerie=" + numeroSerie +
              '}';
    }
  }