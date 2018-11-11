#ifdef _MYSTRING_H
#define _MYSTRING_H

#include<iostream.h>

class NewString
{
public:
	NewString( );
	NewString( const chr * s );
	NewString( const NewString & str );
	~NewString( );

	int length() const;
	int find(const NewString & str) const;
	int find(char ch) const;
	NewString substr(int pos, int len) const;

	char * c_str() const;

	const NewString & operator = ( const NewString & str );
