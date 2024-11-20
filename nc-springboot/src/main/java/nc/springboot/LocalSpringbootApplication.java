package nc.springboot;


import nc.springboot.core.NcSpringApplication;
import nc.springboot.core.NcSpringBootApplication;

@NcSpringBootApplication
public class LocalSpringbootApplication
{
    public static void main( String[] args )
    {
        NcSpringApplication.run(LocalSpringbootApplication.class);
    }
}
