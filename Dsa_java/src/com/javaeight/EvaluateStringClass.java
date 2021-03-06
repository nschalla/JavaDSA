package com.javaeight;



import java.util.Scanner;
import java.util.Stack;

public class EvaluateStringClass
{
	public static int evaluateExpression(String expression)
	{
		char[] expressionCharArray = expression.toCharArray();
		Stack<Integer> valuesStack = new Stack<Integer>();

		Stack<Character> operandStack = new Stack<Character>();

		for (int iterator = 0; iterator < expressionCharArray.length; iterator++)
		{
			
			if (expressionCharArray[iterator] == ' ')
				continue;

			
			if (expressionCharArray[iterator] >= '0' &&
				expressionCharArray[iterator] <= '9')
			{
				StringBuffer multipleDigitsStore = new
							StringBuffer();
				
			
				while (iterator < expressionCharArray.length &&
						expressionCharArray[iterator] >= '0' &&
						expressionCharArray[iterator] <= '9')
					multipleDigitsStore.append(expressionCharArray[iterator++]);
				valuesStack.push(Integer.parseInt(multipleDigitsStore.
									toString()));
			
				
				iterator--;
			}

			
			else if (expressionCharArray[iterator] == '(')
				operandStack.push(expressionCharArray[iterator]);

			
			else if (expressionCharArray[iterator] == ')')
			{
				while (operandStack.peek() != '(')
				valuesStack.push(applyOperand(operandStack.pop(),
								valuesStack.pop(),
								valuesStack.pop()));
				operandStack.pop();
			}

			
			else if (expressionCharArray[iterator] == '+' ||
					expressionCharArray[iterator] == '-' ||
					expressionCharArray[iterator] == '*' ||
						expressionCharArray[iterator] == '/')
			{
			
				while (!operandStack.empty() &&
					havePrecedence(expressionCharArray[iterator],
									operandStack.peek()))
				valuesStack.push(applyOperand(operandStack.pop(),
								valuesStack.pop(),
								valuesStack.pop()));

			
				operandStack.push(expressionCharArray[iterator]);
			}
		}

		while (!operandStack.empty())
			valuesStack.push(applyOperand(operandStack.pop(),
							valuesStack.pop(),
						valuesStack.pop()));

		
		return valuesStack.pop();
	}

	
	public static boolean havePrecedence(
						char operandOne, char operandTwo)
	{
		if (operandTwo == '(' || operandTwo == ')')
			return false;
		if ((operandOne == '*' || operandOne == '/') &&
			(operandTwo == '+' || operandTwo == '-'))
			return false;
		else
			return true;
	}

	
	public static int applyOperand(char operand,
						int firstValue, int secondValue)
	{
		switch (operand)
		{
		case '+':
			return firstValue + secondValue;
		case '-':
			return firstValue - secondValue;
		case '*':
			return firstValue * secondValue;
		case '/':
			if (secondValue == 0)
				throw new
				UnsupportedOperationException(
					"Cannot divide by zero");
			return firstValue / secondValue;
		}
		return 0;
	}


	public static void main(String[] args)
	{
		  Scanner reader = new Scanner(System.in);
	      System.out.println("Enter math expression to calculate");
	      String expression = reader.nextLine();
	      System.out.println(EvaluateStringClass.evaluateExpression(expression));
	      reader.close();
		 
		
	}
}
