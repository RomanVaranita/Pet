public class Pet {

  String kind;

  String nickname;

  final String birthdate;

  int weight;

  public Pet(String kind, String nickname, String birthdate, int weight);{
    this.kind = kind;
    this.nickname = nickname;
    this.birthdate = birthdate;
    this.weight = weight;
  }

  public String getKind() {
    return kind;
  }

  public String getNickname() {
    return nickname;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public int getWeight() {
    return weight;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
