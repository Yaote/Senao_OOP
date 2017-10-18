/* ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   Module Name          : com.senao.ScheduleManagerTest
   Module Description   :

   Date Created      : 2017年10月18日
   Original Author   : 015336
   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
package com.senao;

import java.io.File;
import java.util.List;

import org.junit.Test;

public class ScheduleManagerTest {
	@Test
	public void main() throws Exception {
		File file = new File("D:\\schedule.json");
		ScheduleManager scheduleManager = new ScheduleManager();
		List<Schedule> scheduleList = scheduleManager.ProcessConfigs(file);
		System.out.println(scheduleManager.Count());
		System.out.println(scheduleList.toString());
	}
}