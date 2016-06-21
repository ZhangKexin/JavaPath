package DesignPattern;

/**
 * Created by zkx on 2015/8/27.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }

    //����һ������ʱ��ֻ����һ����ʵ��Sender����һ��������ʵ��Provider
    public interface Sender {
        void Send();
    }

    public interface Provider {
        Sender produce();
    }

    public static class MailSender implements Sender {
        @Override
        public void Send() {
            System.out.println("this is Mail!");
        }
    }

    public class SmsSender implements Sender {
        @Override
        public void Send() {
            System.out.println("this is Sms!");
        }
    }

    public static class SendMailFactory implements Provider {
        @Override
        public Sender produce() {
            return new MailSender();
        }
    }

    public class SendSmsFactory implements Provider {
        @Override
        public Sender produce() {
            return new SmsSender();
        }
    }
}
