🎯CS01 개발환경과 리눅스
=

# Mission 1. 개발환경

## 공통 배경지식 : git

- 프로젝트를 만들 때 get from vcs 로 만들기
- git status : 현재 상황 확인
- git add 파일명(첫 글자 치고 tab) : unstaged 에서 stage 로 올려준다
- git restore --staged 파일명 : stage에서 다시 unstage로 복구
- git commit -m “커밋메세지” : 커밋메세지 남기고 커밋 (m은 메세지의 약자) , 커밋된 모든 파일들이 같은 커밋메세지로 넘어가므로 주의할것
- git log : 커밋된 로컬에 저장된 것과 푸시된 리모트에 저장된 것을 보여준다.
   - (push 할 시 (HEAD -> main, origin/main, origin/HEAD) 가 (위로) 붙어나옴
- 두 곳 이상에 push 할 때
- git remote -v : 어디로 연결되어 있는지 확인
- git remote add [<옵션>] <이름> <url> : 연결할 레파지토리 추가
- git push -f 이름 main(or master?)  : ‘이름’이 연결된 곳으로 push (-f는 force의 약자)
- git checkout main : HEAD 현재 위치 확인
- git reset --hard origin/main : 현재 로컬 저장소의 sub 브랜치에 있는 모든 내용과 변경사항을 버리고, 원격저장소의 main 브랜치와 동일하게 만든다.

## 이진법 ~ 십진법 변환

### 1. 입력을 문자형으로 받는다.

- 입력에 정수가 올 수 도 있고 boolean 배열이 올 수 도 있다.
- 입력의 첫 글자가 대괄호("[")일 때는 boolean 배열일 것이고 아닐 경우에는 정수일 것이다.
- 입력이 boolean 배열일 경우 반점의 갯수+1 만큼의 배열일 것이다.

### 2. 십진법 to 이진법

- 입력된 정수는 256 미만이라 하였으나 이후 다룰 sumBinary 함수에서는 256이 넘어가는 경우를 다뤄야하기에 256 이상의 자연수까지 고려했다.
- 입력받은 정수를 2로 나누었을 때의 나머지가 0이 아니면 참, 반대의 경우 거짓이다.

### 3. 이진법 to 십진법

- 입력된 boolean 배열은 2^0 부터 거듭제곱을 순차적으로 확인했을때 true일 경우 값을 누적합 시켜주면 된다.

# Mission 2. 가상머신 리눅스

## 가상환경 설치

1. Parallels 와 ubuntu 설치

2. Open SSH 설치

   - sudo apt update

   - sudo apt install openssh-server

3. SSH Server 실행

   - $ sudo systemctl status ssh

4. 가상환경의 ip 확인 후 로컬 컴퓨터에서 로그인

5. 디렉토리 생성 후 접근권한 764로 변경

   - https://www.delftstack.com/ko/howto/linux/how-to-make-new-directories-in-linux/ (참고)
   -
   ![img.png](img.png)

6. 날짜, 시간 지정

   ![img_1.png](img_1.png)

7. 자바 설치
   - Could not get lock/var/lib/kpkg/lock-frontend 에러발생

   - https://kgu0724.tistory.com/71 (해결법)

   ![img_2.png](img_2.png)