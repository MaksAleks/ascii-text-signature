# ASCII Text signature: make it notable

### Description
Let's change the font of the text. The font will be larger.  
It will consist of multiple rows and columns of standard console symbols.

The new font is shown below:

```
____ ___  ____ ___  ____ ____ ____ _  _ _  _ _  _ _    _  _
|__| |__] |    |  \ |___ |___ | __ |__| |  | |_/  |    |\/|
|  | |__] |___ |__/ |___ |    |__] |  | | _| | \_ |___ |  |
_  _ ____ ___  ____ ____ ____ ___ _  _ _  _ _ _ _ _  _ _   _ ___ 
|\ | |  | |__] |  | |__/ [__   |  |  | |  | | | |  \/   \_/    / 
| \| |__| |    |_\| |  \ ___]  |  |__|  \/  |_|_| _/\_   |    /__
```

This font consists of the symbols: `'_', '|', '/', '\', ']', '['`
Note that there are no lowercase letters, everything is uppercase

Notice that the width of the letters in this font varies.  
For example, the width of the letter T is 3 characters, and  
for the letter Y, it is 5. You can find the letter boundaries  
by determining spaces in the same positions in all three lines of the
font.

Also, each tag should contain the status of the person wearing it.  
This could be "VIP", "Worker", "Speaker", "Administrator",
"Participant", or something else.These statuses should appear on the
tag, below the person's name.  
This information is not as important as the name, so it should be
printed in a smaller font.

To be readable, every symbol in this font should be separated by a
column of spaces.

You may have noticed that there is no space among these symbols. As
shown in the example below, you should consider a space to be 4 symbols
wide not including spaces between symbols, or 6 symbols wide including
spaces between symbols.

Also, there should be exactly two spaces between the border and the
beginning and end of the name (or status, if it is longer than the
name).

In some cases, the width of the tag may have an even number of symbols
while the status has an odd number of symbols (or vice versa). In these
cases, you cannot generate a status that sits right in the middle, since
it will always be offset by one character on the left or the right. In
this case, your program should move the status to the left so there is
one fewer space to the left of the status than to the right it.

### Output examples

```
Enter name and surname: Bill Gates
Enter person's status: VIP
***************************************************
*  ___  _ _    _         ____ ____ ___ ____ ____  *
*  |__] | |    |         | __ |__|  |  |___ [__   *
*  |__] | |___ |___      |__] |  |  |  |___ ___]  *
*                       VIP                       *
***************************************************
```

```
Enter name and surname: Tom Smith
Enter person's status: Worker
*********************************************
*  ___ ____ _  _      ____ _  _ _ ___ _  _  *
*   |  |  | |\/|      [__  |\/| |  |  |__|  *
*   |  |__| |  |      ___] |  | |  |  |  |  *
*                  Worker                   *
*********************************************
```

```
Enter name and surname: Mr Anonimous
Enter person's status: Participant
**************************************************************
*  _  _ ____      ____ _  _ ____ _  _ _ _  _ ____ _  _ ____  *
*  |\/| |__/      |__| |\ | |  | |\ | | |\/| |  | |  | [__   *
*  |  | |  \      |  | | \| |__| | \| | |  | |__| |__| ___]  *
*                        Participant                         *
**************************************************************
```

```
Enter name and surname: John S
Enter person's status: Worker-coworker-superdupercoworker
****************************************
*      _ ____ _  _ _  _      ____      *
*      | |  | |__| |\ |      [__       *
*     _| |__| |  | | \|      ___]      *
*  Worker-coworker-superdupercoworker  *
****************************************
```
