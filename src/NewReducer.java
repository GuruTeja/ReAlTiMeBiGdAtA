import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class NewReducer extends
Reducer<IntWritable, IntWritable, IntWritable, IntWritable> {

public void reduce(IntWritable line, IntWritable values, Context context) //iterable summates values from mapper which has same value 
    throws IOException, InterruptedException {
//int sum = 0;
//for (IntWritable value : values) {
  //  sum += value.get();
//}
	
context.write(line,values);
}
}