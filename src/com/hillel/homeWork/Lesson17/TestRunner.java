package com.hillel.homeWork.Lesson17;

import com.hillel.homeWork.Lesson17.unit_testing.SimpleMathLibraryTest;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;

import java.io.PrintWriter;

public class TestRunner {

    public static void main(String[] args) {

       // startTestsByPackage("com.hillel.homeWork.Lesson17.unit_testing");
       // startTestsByClassName("com.hillel.homeWork.Lesson17.unit_testing.SimpleMathLibraryTest");
        SimpleMathLibraryTest simpleMathLibraryTest = new SimpleMathLibraryTest();
        startTestsByClass(simpleMathLibraryTest);

    }

    public static void startTestsByClassName(String className) {

        var launcher = LauncherFactory.create();
        SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(summaryGeneratingListener);

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectClass(className))
                .build();
        launcher.execute(request);
        try (var writer = new PrintWriter(System.out)) {
            summaryGeneratingListener.getSummary().printTo(writer);
        }

    }

    public static void startTestsByClass(SimpleMathLibraryTest simpleMathLibraryTest) {
        var launcher = LauncherFactory.create();
        SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(summaryGeneratingListener);

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectClass(simpleMathLibraryTest.getClass()))
                .build();
        launcher.execute(request);
        try (var writer = new PrintWriter(System.out)) {
            summaryGeneratingListener.getSummary().printTo(writer);
        }

    }

    public static void startTestsByPackage(String packageName) {
        var launcher = LauncherFactory.create();
        SummaryGeneratingListener summaryGeneratingListener = new SummaryGeneratingListener();
        launcher.registerTestExecutionListeners(summaryGeneratingListener);

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder
                .request()
                .selectors(DiscoverySelectors.selectPackage(packageName))
                .build();
        launcher.execute(request);
        try (var writer = new PrintWriter(System.out)) {
            summaryGeneratingListener.getSummary().printTo(writer);
        }
    }



}
