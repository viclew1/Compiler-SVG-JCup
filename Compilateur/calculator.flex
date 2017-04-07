
%%
   
%package calculator
%class Lexer
%public
%line
%column
%cup

%%

[ \t\n\r]		{ }
^#.*			{ }

"="						{ return getSymbolFactory().newSymbol ("EGAL", Sym.EGAL); }
"+"						{ return getSymbolFactory().newSymbol ("PLUS", Sym.PLUS); }
"-"						{ return getSymbolFactory().newSymbol ("MOINS", Sym.MOINS); }
"*"						{ return getSymbolFactory().newSymbol ("MULT", Sym.MULT); }
"/"						{ return getSymbolFactory().newSymbol ("DIV", Sym.DIV); }
"("						{ return getSymbolFactory().newSymbol ("OP", Sym.OP); }
")"						{ return getSymbolFactory().newSymbol ("CP", Sym.CP); }

"RECT"					{ return getSymbolFactory().newSymbol ("RECT", Sym.RECT); }
"CIRCLE"				{ return getSymbolFactory().newSymbol ("CIRCLE", Sym.CIRCLE); }
"ELLIPSE"				{ return getSymbolFactory().newSymbol ("ELLIPSE", Sym.ELLIPSE); }
"TEXTE"					{ return getSymbolFactory().newSymbol ("TEXTE", Sym.TEXTE); }
"GROUPE"				{ return getSymbolFactory().newSymbol ("GROUP", Sym.GROUP); }

"REPEAT"				{ return getSymbolFactory().newSymbol ("REPEAT", Sym.REPEAT); }
"{"					{ return getSymbolFactory().newSymbol ("BEGIN", Sym.BEGIN); }
"}"					{ return getSymbolFactory().newSymbol ("END", Sym.END); }
"\""					{ return getSymbolFactory().newSymbol ("STRING_LIM", Sym.STRING_LIM); }

"FILL"					{ return getSymbolFactory().newSymbol ("FILL", Sym.FILL); }
"STROKE"				{ return getSymbolFactory().newSymbol ("STROKE", Sym.STROKE); }
"SW"					{ return getSymbolFactory().newSymbol ("S_WIDTH", Sym.S_WIDTH); }
"FONT"					{ return getSymbolFactory().newSymbol ("F_SIZE", Sym.F_SIZE); }
"COURBURE"				{ return getSymbolFactory().newSymbol ("COURBURE", Sym.COURBURE); }


[0-9]+					{ return getSymbolFactory().newSymbol ("NOMBRE", Sym.NOMBRE, Integer.parseInt(yytext())); }
[a-zA-Z][a-zA-Z0-9]*	{ return getSymbolFactory().newSymbol ("VAR", Sym.VAR, yytext()); }
#[a-fA-F0-9]+			{ return getSymbolFactory().newSymbol ("Color", Sym.Color, yytext()); }

[^]               		{ throw new Error("Illegal character <"+yytext()+">"); }
