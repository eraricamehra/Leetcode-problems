package practise;



public class MailData {
	  private boolean viaMailGun;

	  private String to;
	  private String body;
	  private String subject;


	  private String cc;
	  private String bcc;
	  private String replyTo;

	  public boolean isViaMailGun() {
	    return viaMailGun;
	  }

	  public void setViaMailGun(boolean viaMailGun) {
	    this.viaMailGun = viaMailGun;
	  }

	  public String getTo() {
	    return to;
	  }

	  public void setTo(String to) {
	    this.to = to;
	  }

	  public String getBody() {
	    return body;
	  }

	  public void setBody(String body) {
	    this.body = body;
	  }

	  public String getSubject() {
	    return subject;
	  }

	  public void setSubject(String subject) {
	    this.subject = subject;
	  }


	  public String getCC() {
	    return cc;
	  }
	  
	  public void setCC(String cc) {
	    this.cc = cc;
	  }

	  public String getBCC() {
	    return bcc;
	  }

	  public void setBCC(String bcc) {
	    this.bcc = bcc;
	  }
	  
	  public String getReplyTo() {
	    return replyTo;
	  }
	  
	  public void setReplyTo(String replyto) {
	    this.replyTo = replyto;
	  }

	  public static MailData getMailData(String to, String subject, String body, boolean viaMailGun) {
	    MailData m = new MailData();
	    m.setTo(to);
	    m.setSubject(subject);
	    m.setBody(body);
	    m.setViaMailGun(viaMailGun);
	    return m;
	  }
	  
}