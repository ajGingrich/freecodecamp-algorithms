# -*- coding: utf-8 -*-
import re


def convert_html(sentence):

    dictionary = {
        "&": "&amp;",
        "<": "&lt;",
        ">": "&​gt;",
        '"': "&​quot;",
        "'": "&​apos;"
    }

    # Create a regular expression  from the dictionary keys
    regex = re.compile("(%s)" % "|".join(map(re.escape, dictionary.keys())))

    return regex.sub(lambda mo: dictionary[mo.string[mo.start():mo.end()]], sentence)

result = convert_html('Stuff in "quotation marks"')
print(result)