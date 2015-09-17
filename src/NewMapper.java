import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class NewMapper extends Mapper <Object, Text, IntWritable , IntWritable>  { //input key,input value,output key,output value
    private final IntWritable ONE = new IntWritable(1);
    //private Text word = new Text();
    private IntWritable line = new IntWritable();
    public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {

        String[] csv = value.toString().split(" ");
        for (String str : csv) {
        	
            line.set(Integer.parseInt(str)); // line has line value
            context.write(line, line);
        }
    }
}
