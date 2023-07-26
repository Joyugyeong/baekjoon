-- 코드를 입력하세요
SELECT A.BOOK_ID, B.AUTHOR_NAME, date_format(A.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
from book a, author b
where a.AUTHOR_ID = b.AUTHOR_ID and CATEGORY = '경제'
order by 3