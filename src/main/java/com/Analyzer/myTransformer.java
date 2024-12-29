package com.Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class myTransformer implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation,Class TestClass, Constructor testConstructor, Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
