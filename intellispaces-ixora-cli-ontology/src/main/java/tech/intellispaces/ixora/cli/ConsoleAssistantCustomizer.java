package tech.intellispaces.ixora.cli;

import java.io.PrintStream;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(ConsoleDomain.class)
public interface ConsoleAssistantCustomizer {

  MovableConsoleHandle dummy(PrintStream ps);
}
