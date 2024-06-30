# Interpreter Design Pattern

## INI file parser using interpreter design pattern

SectionExpression -- a nonterminal expression, that holds all the  expression within the block defined in '[]'

KeyValueExpression -- terminal expression that holds the param and its value, present in INI file. 

Context -- placeholder for the ini file values 