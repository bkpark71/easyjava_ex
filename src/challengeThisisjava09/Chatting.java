package challengeThisisjava09;

public class Chatting {
  class Chat{
    void start(){}
    void sendMessage(String message){}
  }

  void startChat(String chatId){
    // 이것이 자바다 교재 404 page 참고
    // 로컬변수를 로컬클래스에서 사용할 경우 로컬 변수는 final 특성을 가지므로
    // 값을 읽을 수만 있고, 수정할 수 없다.
    String nickName = chatId;
    System.out.println(nickName);

    Chat chat = new Chat(){
      @Override
      public void start() {
        while(true){
          String inputData = "안녕하세요";
          String message = "[" + nickName + "]" + inputData;
          sendMessage(message);
        }
      }
    };
    chat.start();
  }
}
