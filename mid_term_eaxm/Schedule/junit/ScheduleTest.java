import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {
	private Schedule schedule;
	
	@Before 
	public void setUp(){
		schedule = new Schedule();
	}
	
	@Test
	public void testFCFS() {
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 1, 2);
		Work work3 = new Work("work3", 3, 2);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2); works.add(work3);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(8/3));
		result.add(new Double(4/3));
		schedule.FCFS(works);
		/*
		List<Double> res = schedule.FCFS(works);
		assertEquals(result.get(0), res.get(0));
		assertEquals(result.get(1), res.get(1));
		*/
	}
	@Test
	public void testSJF() {
		Work a = new Work("work1",1,2);
		Work b = new Work("work2",2,2);
		Work c = new Work("work3",1,1);
		ArrayList<Work> list = new ArrayList<Work>();
		list.add(a);
		list.add(b);
		list.add(c);
		Schedule s = new Schedule();
		s.SJF(list);
	}
	@Test
	public void testSJF1(){
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 0, 1);
		Work work3 = new Work("work3", 1, 1);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2); works.add(work3);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(2));
		result.add(new Double(4/3));
		
		schedule.SJF(works);
	}
	
	
	@Test
	public void testSJF2(){
		Work work1 = new Work("work1", 0, 2);
		Work work2 = new Work("work2", 3, 1);
		List<Work> works = new ArrayList<Work>();
		works.add(work1); works.add(work2);
		
		List<Double> result = new ArrayList<Double>();
		result.add(new Double(3/2));
		result.add(new Double(1));
		
		schedule.SJF(works);
	}
	
	@Test
	public void testSortByServiceTime() {
		Work a = new Work("work1",1,2);
		Work b = new Work("work2",2,2);
		Work c = new Work("work3",1,1);
		ArrayList<Work> list = new ArrayList<Work>();
		list.add(a);
		list.add(b);
		list.add(c);
		Schedule s = new Schedule();
		s.sortByServiceTime(list);
	}
}
