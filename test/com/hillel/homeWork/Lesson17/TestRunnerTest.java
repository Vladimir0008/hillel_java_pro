package com.hillel.homeWork.Lesson17;

import org.junit.platform.engine.discovery.ClassSelector;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class TestRunnerTest {

    public static void main(String[] args) {
        TestRunnerTest testRunnerTest = new TestRunnerTest();

        //startTestsByPackage("com.hillel.homeWork.Lesson17.unit_testing");
        //testRunnerTest.startTestsByClassName("com.hillel.homeWork.Lesson17.unit_testing.SimpleMathLibraryTest");
        //testRunnerTest.startTestsByClasses(SimpleMathLibraryTest.class, ArrayHandlerTest.class);
        //testRunnerTest.startTestsByClass(SimpleMathLibraryTest.class);
        //testRunnerTest.startTestsByClassNames("com.hillel.homeWork.Lesson17.unit_testing.SimpleMathLibraryTest", "com.hillel.homeWork.Lesson17.unit_testing.ArrayHandlerTest");
        testRunnerTest.startTestsByPackage("com.hillel.homeWork.Lesson17.unit_testing");

    }

    public void startTestsByPackage(String pathToPackage) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectPackage(pathToPackage))
                .build();
        launcherExecution(request);
    }

    public void startTestsByClasses(Class... classes) {
        ClassSelector[] classSelector = Stream.of(classes)
                .map(DiscoverySelectors::selectClass)
                .toArray(ClassSelector[]::new);
        LauncherDiscoveryRequest request = createLauncherDiscoveryRequest(classSelector);
        launcherExecution(request);
    }

    public void startTestsByClassNames(String... classNames) {
        ClassSelector[] classSelector = Stream.of(classNames)
                .map(DiscoverySelectors::selectClass)
                .toArray(ClassSelector[]::new);
        LauncherDiscoveryRequest request = createLauncherDiscoveryRequest(classSelector);
        launcherExecution(request);
    }

    public void startTestsByClass(Class clazz) {
        ClassSelector classSelector = DiscoverySelectors.selectClass(clazz);
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(classSelector)
                .build();
        launcherExecution(request);
    }

    public void startTestsByClassName(String className) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectClass(className))
                .build();
        launcherExecution(request);

    }

    private LauncherDiscoveryRequest createLauncherDiscoveryRequest(ClassSelector[] classSelectors) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(classSelectors)
                .build();
        return request;
    }

    private void launcherExecution(LauncherDiscoveryRequest request) {
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(summaryGeneratingListener);
        launcher.execute(request);

        TestExecutionSummary summary = summaryGeneratingListener.getSummary();
        writeToConsole(summary);
        writeToFile(summary);
    }

    private void writeToConsole(TestExecutionSummary summary) {
        try (var writer = new PrintWriter(System.out)) {
            summary.printTo(writer);
        }
    }

    private  void writeToFile(TestExecutionSummary summary) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        try (var writer = new PrintWriter(new FileWriter("test/com/hillel/homeWork/Lesson17/result.txt"))) {
            writer.write("Local date: " + LocalDateTime.now().format(formatter));
            summary.printTo(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}