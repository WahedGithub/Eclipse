package Analyzer;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer{

	public void trasnform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
