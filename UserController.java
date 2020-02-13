@Controller
public class UserController{

    // 로그인 페이지로 이동 !!
    @RequestMapping("/user/login.do")
    public String login() {
        logger.info("경로 : login")

        return "user/login";
    }	

    // 회원가입 페이지로 이동 !!
    @RequestMapping("/user/insert.do")
    public String insert() {
        logger.info("경로 : insert")

        return "user/insert";
    }

    // 회원수정 페이지로 이동 !!
    @RequestMapping("/user/update.do")
    public String update() {
        logger.info("경로 : update")

        return "user/update";
    }	

    // 회원삭제 페이지로 이동 ~~
    @RequestMapping("/user/delete.do")
    public String delete() {
        logger.info("경로 : delete")

        return "user/delete";
    }		

<<<<<<< HEAD
   // 회원조회 페이지로 이동 ~~ -- master에서 작업
=======
  // 회원조회 페이지로 이동 !! - develop 브랜치에서 작업했음
>>>>>>> develop
    @RequestMapping("/user/select.do")
    public String select() {
        logger.info("경로 : select")

        return "user/select";
    }	
<<<<<<< HEAD
=======

>>>>>>> develop
}