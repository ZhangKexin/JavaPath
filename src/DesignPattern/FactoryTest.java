package DesignPattern;

/**
 * Created by zkx on 2015/8/27.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SimpleSendFactory simpleFactory = new SimpleSendFactory();
        Sender sender = simpleFactory.produce("sms");
        sender.Send();
        SendFactoryMethod factoryMethod = new SendFactoryMethod();
        sender = factoryMethod.produceMail();
        sender.Send();
        sender = StaticFactoryMethod.produceMail();
        sender.Send();
    }

    public interface Sender {
        void Send();
    }

    public static class MailSender implements Sender {
        @Override
        public void Send() {
            System.out.println("this is MailSender!");
        }
    }

    public static class SmsSender implements Sender {
        @Override
        public void Send() {
            System.out.println("this is SmsSener!");
        }
    }


    // 简单工厂，字符串有误，则不能正确创建对象
    public static class SimpleSendFactory {
        public Sender produce(String type) {
            if ("mail".equals(type)) {
                return new MailSender();
            } else if ("sms".equals(type)) {
                return new SmsSender();
            } else {
                return null;
            }
        }
    }

    //工厂方法
    public static class SendFactoryMethod {
        public Sender produceMail() {
            return new MailSender();
        }

        public Sender produceSms() {
            return new SmsSender();
        }
    }

    //静态方法模式，不需要实例化工厂类
    public static class StaticFactoryMethod {
        public static Sender produceMail() {
            return new MailSender();
        }

        public static Sender produceSms() {
            return new SmsSender();
        }
    }
}

