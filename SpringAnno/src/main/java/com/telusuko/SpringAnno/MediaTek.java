package com.telusuko.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class MediaTek implements MobileProcessor {

	public void proces() {
		// TODO Auto-generated method stub
		System.out.println("2nd best cpu");
	}

}
