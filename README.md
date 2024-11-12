# Zombie Game
* 자바의 추상화 메소드를 이용한 콘솔게임
> ##### 1. 게임 설명
> ##### 2. 게임 실행 화면 (Demo)
> ##### 3. Zombie Game UML Diagram

## 1. 게임 설명
* 이동을 하며 랜덤으로 만나는 몬스터를 처치하고 레벨을 올리며 보스를 물리치는 게임
 * #### 스탯
   * 플레이어의 공격력 : **1 ~ 레벨 * 2**이다.
   * 좀비의 공격력 : **1 ~ 레벨 * 2**이다.
   * 스켈레톤의 공격력 : **1 ~ 레벨 * 3**이다.
   * 보스의 공격력 : **1 ~ 레벨 * 5**이다.
   * 플레이어 및 몬스터의 방어력 : **레벨 / 2**이다.
   * 데미지 계산식 : **공격력 - 해당 엔티티 방어력**이다.
* #### 게임 방식
  * **숫자 1 입력**시 **이동**한다.
  * **숫자 2 입력**시 **휴식카운트**를 사용하여 **휴식**이 가능하다.
    - 휴식카운트는 **몬스터 처치**시 얻을 수 있다.
  * **숫자 3 입력**시 **종료**한다.

  * MP를 사용하여 **스킬**사용이 가능하다.
  * 일반공격시 **마나 10**이 **회복**한다.

## 2. 게임 실행 화면 (Demo)
![Demo](https://github.com/leejunho0622/Mini01/blob/main/ZombieGameDemo.gif)
## 3. Zombie Game UML Diagram
![UML Diagram](https://github.com/leejunho0622/Mini01/blob/main/ZombieUML..png)
